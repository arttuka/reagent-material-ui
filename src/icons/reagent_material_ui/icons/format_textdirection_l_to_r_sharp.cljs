(ns reagent-material-ui.icons.format-textdirection-l-to-r-sharp
  "Imports @material-ui/icons/FormatTextdirectionLToRSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-textdirection-l-to-r-sharp (create-svg-icon (e "path" #js {"d" "M9 10v5h2V4h2v11h2V4h2V2H9C6.79 2 5 3.79 5 6s1.79 4 4 4zm12 8l-4-4v3H5v2h12v3l4-4z"})
                                                        "FormatTextdirectionLToRSharp"))
