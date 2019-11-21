(ns app.core
  (:require
    [reagent.core :as r]))

(defn app [] [:div "shadow-cljs-node-test-variants is running!"])

(defn ^:dev/after-load start
  []
  (r/render [app] (.getElementById js/document "app")))

(defn ^:export main [] (start))