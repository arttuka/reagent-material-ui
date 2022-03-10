(ns reagent-mui.icons.roller-shades-outlined
  "Imports @mui/icons-material/RollerShadesOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roller-shades-outlined (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zM18 5v6H6V5h12zM6 19v-6h5v1.82c-.45.32-.75.84-.75 1.43 0 .97.78 1.75 1.75 1.75s1.75-.78 1.75-1.75c0-.59-.3-1.12-.75-1.43V13h5v6H6z"})
                                             "RollerShadesOutlined"))
