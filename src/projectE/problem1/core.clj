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

(defn largest-multiple-of-x-under-n [x n]
  (* x (quot n x)))

(defn amount-of-numbers-div-by-x-under-n [x n]
  (inc (quot (dec n) x)))

(defn sum-of-number-div-by-x-under-n [x n]
  (quot (* (largest-multiple-of-x-under-n x n)
           (amount-of-numbers-div-by-x-under-n x (dec n))) 
        2))

(defn solve-fast [n]
  (- (+ (sum-of-number-div-by-x-under-n 3 n)
        (sum-of-number-div-by-x-under-n 5 n))
     (sum-of-number-div-by-x-under-n 15 n)))

(defn problem1-example []
  (sum-of (natural-numbers-below 10 (multiples-of 3 5))))

(defn problem1-solution1 []
  (sum-of (natural-numbers-below 1000 (multiples-of 3 5))))

(defn problem1-solution2 []
  (solve-fast 1000))

(defn -main
  []
  (println "The sum of all natural numbers below 1000 that are multiples of 3 or 5 is" (problem1-solution1)))