(ns bkmarker.views.bookmarks
  (:require [hiccup.core :refer :all]
            [maxfund.db.dbconn :refer [db-spec]]
            [yesql.core :refer [defqueries]]
            [ring.util.request :refer [path-info]]
            [hiccup.page :refer :all]))

(defqueries "maxfund/models/cat.sql")
