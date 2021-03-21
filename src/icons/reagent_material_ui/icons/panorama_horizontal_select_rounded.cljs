(ns reagent-material-ui.icons.panorama-horizontal-select-rounded
  "Imports @material-ui/icons/PanoramaHorizontalSelectRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def panorama-horizontal-select-rounded (create-svg-icon (e "path" #js {"d" "M12 5.5c-3.89 0-6.95-.84-8.69-1.43-.64-.22-1.31.26-1.31.95V19c0 .68.66 1.17 1.31.95C5.36 19.26 8.1 18.5 12 18.5c3.87 0 6.66.76 8.69 1.45.65.21 1.31-.27 1.31-.95V5c0-.68-.66-1.17-1.31-.95-2.03.68-4.83 1.45-8.69 1.45z"})
                                                         "PanoramaHorizontalSelectRounded"))
