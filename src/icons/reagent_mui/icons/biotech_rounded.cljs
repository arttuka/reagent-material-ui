(ns reagent-mui.icons.biotech-rounded
  "Imports @mui/icons-material/BiotechRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def biotech-rounded (create-svg-icon [(e "path" #js {"d" "M7 19c-1.1 0-2 .9-2 2h14c0-1.1-.9-2-2-2h-4v-2h3c1.1 0 2-.9 2-2h-8c-1.66 0-3-1.34-3-3 0-1.09.59-2.04 1.46-2.56C8.17 9.03 8 8.54 8 8c0-.21.04-.42.09-.62C6.28 8.13 5 9.92 5 12c0 2.76 2.24 5 5 5v2H7z"}) (e "path" #js {"d" "M10.56 5.51C11.91 5.54 13 6.64 13 8c0 .75-.33 1.41-.85 1.87l.25.68c.19.52.76.79 1.28.6.19.52.76.79 1.28.6.52-.19.79-.76.6-1.28.52-.19.79-.76.6-1.28L14.1 3.54c-.19-.52-.76-.79-1.28-.6-.19-.52-.76-.79-1.28-.6-.52.19-.79.76-.6 1.28-.52.19-.79.76-.6 1.28l.22.61z"}) (e "circle" #js {"cx" "10.5", "cy" "8", "r" "1.5"})]
                                      "BiotechRounded"))
