(ns reagent-mui.icons.crib-rounded
  "Imports @mui/icons-material/CribRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crib-rounded (create-svg-icon (e "path" #js {"d" "M18.32 18.32c-.36-.36-.92-.4-1.31-.08-.32.25-.65.48-1 .69V16h2c1.1 0 2-.9 2-2v-3c0-1.1-.9-2-2-2h-6V6c0-1.1-.9-2-2-2H8C5.79 4 4 5.79 4 8v6c0 1.1.9 2 2 2h2v2.93c-.35-.2-.69-.43-1-.69-.39-.32-.96-.27-1.31.08-.42.42-.39 1.12.08 1.5C7.47 21.18 9.64 22 12 22c2.36 0 4.53-.82 6.24-2.18.47-.38.5-1.08.08-1.5zM14 19.75c-.64.16-1.31.25-2 .25s-1.36-.09-2-.25V16h4v3.75z"})
                                   "CribRounded"))
