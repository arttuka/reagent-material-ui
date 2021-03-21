(ns reagent-material-ui.icons.biotech-sharp
  "Imports @material-ui/icons/BiotechSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def biotech-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13 19v-2h5v-2h-8c-1.66 0-3-1.34-3-3 0-1.09.59-2.04 1.46-2.56C8.17 9.03 8 8.54 8 8c0-.21.04-.42.09-.62C6.28 8.13 5 9.92 5 12c0 2.76 2.24 5 5 5v2H5v2h14v-2h-6z"}) (e "path" #js {"d" "M10.56 5.51C11.91 5.54 13 6.64 13 8c0 .75-.33 1.41-.85 1.87l.59 1.62.94-.34.34.94 1.88-.68-.34-.94.94-.34-2.74-7.53-.94.34-.34-.94-1.88.68.34.94-.94.35.56 1.54z"}) (e "circle" #js {"cy" "8", "r" "1.5", "cx" "10.5"}))
                                    "BiotechSharp"))
