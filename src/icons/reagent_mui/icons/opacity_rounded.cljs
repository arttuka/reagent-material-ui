(ns reagent-mui.icons.opacity-rounded
  "Imports @mui/icons-material/OpacityRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def opacity-rounded (create-svg-icon (e "path" #js {"d" "M17.65 7.56 12.7 2.69c-.39-.38-1.01-.38-1.4 0L6.35 7.56C4.9 8.99 4 10.96 4 13.13 4 17.48 7.58 21 12 21s8-3.52 8-7.87c0-2.17-.9-4.14-2.35-5.57zm-9.9 1.43L12 4.81l4.25 4.18c.88.87 2.04 2.59 1.67 5.01H6.07c-.37-2.42.8-4.15 1.68-5.01z"})
                                      "OpacityRounded"))
