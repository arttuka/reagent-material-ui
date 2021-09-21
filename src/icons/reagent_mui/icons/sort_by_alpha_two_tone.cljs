(ns reagent-mui.icons.sort-by-alpha-two-tone
  "Imports @mui/icons-material/SortByAlphaTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sort-by-alpha-two-tone (create-svg-icon (e "path" #js {"d" "M14.94 4.66 12.58 2.3l-2.36 2.36zm-4.55 13.07h1.84L7.74 6.27H6.1L1.6 17.73h1.84l.92-2.45h5.11l.92 2.45zm-5.42-4.09 1.94-5.18 1.94 5.18H4.97zm7.61 8.06 2.33-2.33h-4.66zm9.08-14.16V6.28h-8.3v1.6h5.88l-5.92 8.56v1.29h8.53v-1.59h-6.12z"})
                                             "SortByAlphaTwoTone"))
