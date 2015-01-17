(ns projectE.problem2.core-spec
  (:require [speclj.core :refer :all]
            [projectE.problem2.core :refer :all]))

(describe "the fibonacci-sequence"
  (it "tests that the first 10 fibonacci numbers are correct"
    (should= '(1, 2, 3, 5, 8, 13, 21, 34, 55, 89) (take 10 (fib-seq)))))

(describe "the fibonacci-sequence whose values do not exceed a border"
  (it "tests the fibonacce sequence under 10 is"
    (should= '(1,2,3,5,8) (fib-seq (under 10)))))

(describe "even-valued terms"
  (it "tests the even fibs under 10"
    (should= '(2,8) (even-terms (fib-seq (under 10))))))

(describe "tests the sum"
  (it "tests the sum of even fibs unter 10"
    (should= 10 (sum (even-terms (fib-seq (under 10))))))
  (it "tests the solution with a border of 10"
    (should= 10 (solution 10)))
  (it "tests the solution with a border of 4000000"
    (should= 4613732 (solution 4000000))))

