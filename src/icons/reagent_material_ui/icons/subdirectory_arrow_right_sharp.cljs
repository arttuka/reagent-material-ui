(ns reagent-material-ui.icons.subdirectory-arrow-right-sharp
  "Imports @material-ui/icons/SubdirectoryArrowRightSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def subdirectory-arrow-right-sharp (create-svg-icon (e "path" #js {"d" "M19 15l-6 6-1.42-1.42L15.17 16H4V4h2v10h9.17l-3.59-3.58L13 9l6 6z"})
                                                     "SubdirectoryArrowRightSharp"))
