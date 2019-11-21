(ns app.test-runner-require
  (:require [shadow.test.node :as stn]
            [app.core-spec]
            [app.core-devcards-spec]))

(defn main []
  (stn/main))