(ns reagent-mui.icons.price-change-rounded
  "Imports @mui/icons-material/PriceChangeRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def price-change-rounded (create-svg-icon (e "path" #js {"d" "M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6c0-1.11-.89-2-2-2zm-9 6H8v1h3c.55 0 1 .45 1 1v3c0 .55-.45 1-1 1h-1c0 .55-.45 1-1 1s-1-.45-1-1H7c-.55 0-1-.45-1-1s.45-1 1-1h3v-1H7c-.55 0-1-.45-1-1V9c0-.55.45-1 1-1h1c0-.55.45-1 1-1s1 .45 1 1h1c.55 0 1 .45 1 1s-.45 1-1 1zm4.65 5.9L14 14.25h4l-1.65 1.65c-.19.19-.51.19-.7 0zM14 10l1.65-1.65c.2-.2.51-.2.71 0L18 10h-4z"})
                                           "PriceChangeRounded"))
