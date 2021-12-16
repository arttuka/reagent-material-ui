(ns reagent-mui.icons.diamond-rounded
  "Imports @mui/icons-material/DiamondRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def diamond-rounded (create-svg-icon (e "path" #js {"d" "M12.16 3h-.32L9.21 8.25h5.58zm4.3 5.25h5.16l-2.07-4.14C19.21 3.43 18.52 3 17.76 3h-3.93l2.63 5.25zm4.92 1.5h-8.63V20.1zM11.25 20.1V9.75H2.62zM7.54 8.25 10.16 3H6.24c-.76 0-1.45.43-1.79 1.11L2.38 8.25h5.16z"})
                                      "DiamondRounded"))
