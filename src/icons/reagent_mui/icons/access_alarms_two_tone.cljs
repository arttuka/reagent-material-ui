(ns reagent-mui.icons.access-alarms-two-tone
  "Imports @mui/icons-material/AccessAlarmsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def access-alarms-two-tone (create-svg-icon [(e "path" #js {"d" "M12 6c-3.9 0-7 3.1-7 7s3.1 7 7 7 7-3.1 7-7-3.1-7-7-7zm3.7 10.9L11 14V8h1.5v5.3l4 2.4-.8 1.2z", "opacity" ".3"}) (e "path" #js {"d" "m22 5.7-4.6-3.9-1.3 1.5 4.6 3.9zM12.5 8H11v6l4.7 2.9.8-1.2-4-2.4zM12 4c-5 0-9 4-9 9s4 9 9 9 9-4 9-9-4-9-9-9zm0 16c-3.9 0-7-3.1-7-7s3.1-7 7-7 7 3.1 7 7-3.1 7-7 7zM7.9 3.4 6.6 1.9 2 5.7l1.3 1.5z"})]
                                             "AccessAlarmsTwoTone"))
