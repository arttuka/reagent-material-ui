(ns reagent-material-ui.icons.map-sharp
  "Imports @material-ui/icons/MapSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def map-sharp (create-svg-icon (e "path" #js {"d" "M15 5.1L9 3 3 5.02v16.2l6-2.33 6 2.1 6-2.02V2.77L15 5.1zm0 13.79l-6-2.11V5.11l6 2.11v11.67z"})
                                "MapSharp"))
