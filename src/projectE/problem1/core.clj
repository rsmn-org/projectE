(ns projectE.problem1.core
  (:gen-class))

(defn natural-numbers-below
  ([n] (range n))
  ([n f] (filter f (range n))))

(defn multiples-of
  ([x]
    (fn [t] (= (rem t x) 0)))
  ([x y]
    (fn [t] (or ((multiples-of x) t) ((multiples-of y) t)))))

(defn sum-of [coll]
  (reduce + coll))

(defn problem1-example []
  (sum-of (natural-numbers-below 10 (multiples-of 3 5))))

(defn problem1-question []
  (sum-of (natural-numbers-below 1000 (multiples-of 3 5))))

(defn -main
  []
  (println "The sum of all natural numbers below 1000 that are multiples of 3 or 5 is" (problem1-question)))