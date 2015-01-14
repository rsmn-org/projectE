(ns projectE.problem1.core-spec
  (:require [speclj.core :refer :all]
            [projectE.problem1.core :refer :all]))

(describe "list all the natural numbers below a border"
           (it "tests that all numbers below 1 are shown"
               (should= [0] (natural-numbers-below 1)))
           (it "tests that all numbers below 2 are shown"
               (should= [0 1] (natural-numbers-below 2)))
           (it "tests that all numbers below 3 are shown"
               (should= [0 1 2] (natural-numbers-below 3))))

(describe "list all the natural numbers below a border that are multiples of 3"
          (it "tests that all numbers below 1 are shown that are multiples of 3"
              (should= [0] (natural-numbers-below 1 (multiples-of 3))))
          (it "tests that all numbers below 2 are shown that are multiples of 3"
              (should= [0] (natural-numbers-below 2 (multiples-of 3))))
          (it "tests that all numbers below 3 are shown that are multiples of 3"
              (should= [0] (natural-numbers-below 3 (multiples-of 3))))
          (it "tests that all numbers below 4 are shown that are multiples of 3"
              (should= [0 3] (natural-numbers-below 4 (multiples-of 3))))
          (it "tests that all numbers below 7 are shown that are multiples of 3"
              (should= [0 3 6] (natural-numbers-below 7 (multiples-of 3)))))

(describe "list all the natural numbers below a border that are multiples of 3 or 5"
          (it "tests that all numbers below 1 are shown that are multiples of 3 5"
              (should= [0] (natural-numbers-below 1 (multiples-of 3 5))))
          (it "tests that all numbers below 2 are shown that are multiples of 3 5"
              (should= [0] (natural-numbers-below 2 (multiples-of 3 5))))
          (it "tests that all numbers below 3 are shown that are multiples of 3 5"
              (should= [0] (natural-numbers-below 3 (multiples-of 3 5))))
          (it "tests that all numbers below 4 are shown that are multiples of 3 5"
              (should= [0 3] (natural-numbers-below 4 (multiples-of 3 5))))
          (it "tests that all numbers below 7 are shown that are multiples of 3 5"
              (should= [0 3 5 6] (natural-numbers-below 7 (multiples-of 3 5)))))

(describe "sum of numbers"
          (it "tests the sum of '(1 2 3)"
              (should= 6 (sum-of '(1 2 3)))))

(describe "If we list all the natural numbers below 10 that are multiples of 3 or 5"
          (it "tests that the sum of these multiples"
              (should= 23 (problem1-example))))

(describe "If we list all the natural numbers below 1000 that are multiples of 3 or 5"
          (it "tests that the sum of these multiples"
              (should= 233168 (problem1-question))))

(run-specs)
