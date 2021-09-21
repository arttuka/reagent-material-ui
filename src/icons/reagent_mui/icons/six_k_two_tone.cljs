(ns reagent-mui.icons.six-k-two-tone
  "Imports @mui/icons-material/SixKTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def six-k-two-tone (create-svg-icon [(e "path" #js {"d" "M8 12.5h1.5V14H8z", "opacity" ".3"}) (e "path" #js {"d" "M5 19h14V5H5v14zm8-10h1.5v2.25L16.25 9H18l-2.25 3L18 15h-1.75l-1.75-2.25V15H13V9zm-6.5 1c0-.55.45-1 1-1H11v1.5H8v1h2c.55 0 1 .45 1 1V14c0 .55-.45 1-1 1H7.5c-.55 0-1-.45-1-1v-4z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "path" #js {"d" "M14.5 12.75 16.25 15H18l-2.25-3L18 9h-1.75l-1.75 2.25V9H13v6h1.5zM7.5 15H10c.55 0 1-.45 1-1v-1.5c0-.55-.45-1-1-1H8v-1h3V9H7.5c-.55 0-1 .45-1 1v4c0 .55.45 1 1 1zm.5-2.5h1.5V14H8v-1.5z"})]
                                     "SixKTwoTone"))
