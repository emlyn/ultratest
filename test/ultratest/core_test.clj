(ns ultratest.core-test
  (:require [clojure.test :refer :all]
            [ultratest.core :refer :all]))

(deftest a-test
  (is (= {:result "abc"
          :foo "123"}
         (foo "abc"))))

(deftest b-test
  (is (= {:result "def"
          :foo 456}
         (foo "def"))))
