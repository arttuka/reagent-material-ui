(ns reagent-material-ui.icons.maps-home-work-two-tone
  "Imports @material-ui/icons/MapsHomeWorkTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def maps-home-work-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M17 11h2v2h-2v2h2v2h-2v2h4V5h-9v1.4l5 3.57V11zm0-4h2v2h-2V7z", "opacity" ".3"}) (e "path" #js {"d" "M10 3v1.97l.96.69L12 6.4V5h9v14h-4v2h6V3z"}) (e "path" #js {"d" "M3 12v7h2v-5h6v5h2v-7L8 8.5z", "opacity" ".3"}) (e "path" #js {"d" "M17 7h2v2h-2zm0 4h2v2h-2zm0 4h2v2h-2zM1 11v10h6v-5h2v5h6V11L8 6l-7 5zm12 8h-2v-5H5v5H3v-7l5-3.5 5 3.5v7z"}))
                                              "MapsHomeWorkTwoTone"))
