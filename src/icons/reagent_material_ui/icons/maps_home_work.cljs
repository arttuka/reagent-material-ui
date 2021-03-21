(ns reagent-material-ui.icons.maps-home-work
  "Imports @material-ui/icons/MapsHomeWork as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def maps-home-work (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M1 11v10h5v-6h4v6h5V11L8 6z"}) (e "path" #js {"d" "M10 3v1.97l7 5V11h2v2h-2v2h2v2h-2v4h6V3H10zm9 6h-2V7h2v2z"}))
                                     "MapsHomeWork"))
