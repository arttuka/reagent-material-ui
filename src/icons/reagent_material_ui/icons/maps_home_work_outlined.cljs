(ns reagent-material-ui.icons.maps-home-work-outlined
  "Imports @material-ui/icons/MapsHomeWorkOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def maps-home-work-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 7h2v2h-2zm0 4h2v2h-2zm0 4h2v2h-2zM1 11v10h6v-5h2v5h6V11L8 6l-7 5zm12 8h-2v-5H5v5H3v-7l5-3.5 5 3.5v7z"}) (e "path" #js {"d" "M10 3v1.97l2 1.43V5h9v14h-4v2h6V3z"}))
                                              "MapsHomeWorkOutlined"))
