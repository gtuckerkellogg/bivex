(defproject bivex "0.1.0-SNAPSHOT"
  :description "Bivalency and gene expression simulator"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-path "src"
  :dependencies [[org.clojure/clojure "1.8.0"]
;                 [cheshire "5.8.0"]
                 [com.rpl/specter "1.1.1"]
                 [hswick/jutsu "0.1.2"]
                 [org.clojure/data.csv "0.1.4"]
                 [org.clojure/tools.cli "0.3.1"]
                 ]
  :main bivex.core
;  :jvm-opts ["--add-modules" "java.xml.bind"]
  )
