(ns reagent-mui.icons.airline-seat-recline-extra-sharp
  "Imports @mui/icons-material/AirlineSeatReclineExtraSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def airline-seat-recline-extra-sharp (create-svg-icon (e "path" #js {"d" "M5.35 5.64c-.9-.64-1.12-1.88-.49-2.79.63-.9 1.88-1.12 2.79-.49.9.64 1.12 1.88.49 2.79-.64.9-1.88 1.12-2.79.49zM16 19H6.5L4 7H2l2.85 14H16v-2zm.23-4h-4.88l-1.03-4.1c1.58.89 3.28 1.54 5.15 1.22V9.99c-1.63.31-3.44-.27-4.69-1.25L9.14 7.47c-.23-.18-.49-.3-.76-.38-.32-.09-.66-.12-.99-.06h-.02c-1.23.22-2.05 1.39-1.84 2.61L7.44 18h9.24l3.82 3 1.5-1.5-5.77-4.5z"})
                                                       "AirlineSeatReclineExtraSharp"))
