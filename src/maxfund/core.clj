(ns maxfund.core
  (:require [compojure.core :refer :all]
            [ring.middleware.params :refer :all]
            [ring.middleware.cookies :refer [wrap-cookies]]
            [ring.util.response :as resp]
            [compojure.route :refer :all]
            [maxfund.models.model :refer :all]
            [maxfund.views.bookmarks :as v]
            [hiccup.core :as hiccup]
            [clojure.string :as s]
            [org.httpkit.server :refer [run-server]])
  (:gen-class :main true))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

