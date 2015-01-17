(ns projectE.problem2.core
  (:gen-class))

(defn fib-seq
  ([]
    ((fn rfib [a b]
       (lazy-seq (cons a (rfib b (+ a b))))) 1 2))
  ([pred]
    (take-while pred (fib-seq))))

(defn even-terms [coll]
  (filter even? coll))

(defn sum [coll]
  (reduce + coll))

(defn under [n]
  (fn [x] (< x n)))

(defn solution
  [border]
  (sum (even-terms (fib-seq (under border)))))