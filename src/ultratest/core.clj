(ns ultratest.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (dotimes [n 5]
    (Thread/sleep 1000)
    (binding [*out* *err*]
      (println "foo" x n)))
  {:result x
   :foo 123})
