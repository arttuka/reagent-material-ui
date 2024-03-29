(ns reagent-mui.icons.ramp-right-rounded
  "Imports @mui/icons-material/RampRightRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def ramp-right-rounded (create-svg-icon (e "path" #js {"d" "M12 21c.55 0 1-.45 1-1V6.83l.88.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12.7 3.71a.9959.9959 0 0 0-1.41 0L8.71 6.29c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.88-.87V9c0 3.62-2.89 6.22-4.97 7.62-.52.35-.59 1.09-.14 1.53.33.33.87.4 1.26.13C8.74 17.22 10.04 16 11 14.69v5.3c0 .56.45 1.01 1 1.01z"})
                                         "RampRightRounded"))
