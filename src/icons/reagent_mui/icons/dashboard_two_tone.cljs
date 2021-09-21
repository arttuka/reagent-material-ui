(ns reagent-mui.icons.dashboard-two-tone
  "Imports @mui/icons-material/DashboardTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dashboard-two-tone (create-svg-icon [(e "path" #js {"d" "M5 5h4v6H5zm10 8h4v6h-4zM5 17h4v2H5zM15 5h4v2h-4z", "opacity" ".3"}) (e "path" #js {"d" "M3 13h8V3H3v10zm2-8h4v6H5V5zm8 16h8V11h-8v10zm2-8h4v6h-4v-6zM13 3v6h8V3h-8zm6 4h-4V5h4v2zM3 21h8v-6H3v6zm2-4h4v2H5v-2z"})]
                                         "DashboardTwoTone"))
