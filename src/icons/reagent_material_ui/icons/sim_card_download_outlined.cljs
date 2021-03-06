(ns reagent-material-ui.icons.sim-card-download-outlined
  "Imports @material-ui/icons/SimCardDownloadOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sim-card-download-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 2h-8L4 8v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 2v16H6V8.83L10.83 4H18z"}) (e "path" #js {"d" "M16 13l-4 4-4-4 1.41-1.41L11 13.17V9.02L13 9v4.17l1.59-1.59L16 13z"}))
                                                 "SimCardDownloadOutlined"))
