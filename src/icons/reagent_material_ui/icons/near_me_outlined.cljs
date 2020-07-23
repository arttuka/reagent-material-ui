(ns reagent-material-ui.icons.near-me-outlined
  "Imports @material-ui/icons/NearMeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def near-me-outlined (create-svg-icon (e "path" #js {"d" "M17.27 6.73l-4.24 10.13-1.32-3.42-.32-.83-.82-.32-3.43-1.33 10.13-4.23M21 3L3 10.53v.98l6.84 2.65L12.48 21h.98L21 3z"})
                                       "NearMeOutlined"))
