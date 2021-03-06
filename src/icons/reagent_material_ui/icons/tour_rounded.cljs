(ns reagent-material-ui.icons.tour-rounded
  "Imports @material-ui/icons/TourRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def tour-rounded (create-svg-icon (e "path" #js {"d" "M19.52 4H7V3c0-.55-.45-1-1-1s-1 .45-1 1v19h2v-8h12.52c.71 0 1.19-.71.93-1.37L19 9l1.45-3.63c.26-.66-.22-1.37-.93-1.37zm-7.02 7c-1.1 0-2-.9-2-2s.9-2 2-2 2 .9 2 2-.9 2-2 2z"})
                                   "TourRounded"))
