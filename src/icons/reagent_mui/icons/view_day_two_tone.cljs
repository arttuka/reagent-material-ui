(ns reagent-mui.icons.view-day-two-tone
  "Imports @mui/icons-material/ViewDayTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-day-two-tone (create-svg-icon [(e "path" #js {"d" "M4 10h15v4H4z", "opacity" ".3"}) (e "path" #js {"d" "M2 18h19v2H2zM20 8H3c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h17c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 6H4v-4h15v4zM2 4h19v2H2z"})]
                                        "ViewDayTwoTone"))
