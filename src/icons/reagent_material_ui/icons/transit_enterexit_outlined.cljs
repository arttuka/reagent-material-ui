(ns reagent-material-ui.icons.transit-enterexit-outlined
  "Imports @material-ui/icons/TransitEnterexitOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def transit-enterexit-outlined (create-svg-icon (e "path" #js {"d" "M16 18H6V8h3v4.77L15.98 6 18 8.03 11.15 15H16v3z"})
                                                 "TransitEnterexitOutlined"))
