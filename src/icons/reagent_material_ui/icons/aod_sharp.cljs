(ns reagent-material-ui.icons.aod-sharp
  "Imports @material-ui/icons/AodSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def aod-sharp (create-svg-icon (e "path" #js {"d" "M19 1H5v22h14V1zm-2 17H7V6h10v12zm-9-8h8v1.5H8V10zm1 3h6v1.5H9V13z"})
                                "AodSharp"))
