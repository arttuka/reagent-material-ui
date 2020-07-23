(ns reagent-material-ui.icons.stop-outlined
  "Imports @material-ui/icons/StopOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def stop-outlined (create-svg-icon (e "path" #js {"d" "M16 8v8H8V8h8m2-2H6v12h12V6z"})
                                    "StopOutlined"))
