(ns reagent-material-ui.icons.get-app-outlined
  "Imports @material-ui/icons/GetAppOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def get-app-outlined (create-svg-icon (e "path" #js {"d" "M13 5v6h1.17L12 13.17 9.83 11H11V5h2m2-2H9v6H5l7 7 7-7h-4V3zm4 15H5v2h14v-2z"})
                                       "GetAppOutlined"))
