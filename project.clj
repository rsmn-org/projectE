(defproject projectE "0.1.0-SNAPSHOT"
            :description "Some project euler problems"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.6.0"]]
            :dev-dependencies [[speclj "2.9.0"]]
            :plugins [[speclj "2.9.0"]]
            :test-paths ["spec"]
            :main projectE.problem1.core)