(ns reagent-mui.icons.alarm-two-tone
  "Imports @mui/icons-material/AlarmTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def alarm-two-tone (create-svg-icon [(e "path" #js {"d" "M12 6c-3.86 0-7 3.14-7 7s3.14 7 7 7 7-3.14 7-7-3.14-7-7-7zm3.75 10.85L11 14V8h1.5v5.25l4 2.37-.75 1.23z", "opacity" ".3"}) (e "path" #js {"d" "M12.5 8H11v6l4.75 2.85.75-1.23-4-2.37zm4.837-6.19 4.607 3.845-1.28 1.535-4.61-3.843zm-10.674 0 1.282 1.536L3.337 7.19l-1.28-1.536zM12 4c-4.97 0-9 4.03-9 9s4.03 9 9 9 9-4.03 9-9-4.03-9-9-9zm0 16c-3.86 0-7-3.14-7-7s3.14-7 7-7 7 3.14 7 7-3.14 7-7 7z"})]
                                     "AlarmTwoTone"))
