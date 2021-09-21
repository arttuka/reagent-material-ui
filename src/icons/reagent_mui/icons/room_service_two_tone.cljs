(ns reagent-mui.icons.room-service-two-tone
  "Imports @mui/icons-material/RoomServiceTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def room-service-two-tone (create-svg-icon [(e "path" #js {"d" "M12 9.58c-2.95 0-5.47 1.83-6.5 4.41h13c-1.03-2.58-3.55-4.41-6.5-4.41z", "opacity" ".3"}) (e "path" #js {"d" "M2 17h20v2H2zm11.84-9.21c.1-.24.16-.51.16-.79 0-1.1-.9-2-2-2s-2 .9-2 2c0 .28.06.55.16.79C6.25 8.6 3.27 11.93 3 16h18c-.27-4.07-3.25-7.4-7.16-8.21zM12 9.58c2.95 0 5.47 1.83 6.5 4.41h-13c1.03-2.58 3.55-4.41 6.5-4.41z"})]
                                            "RoomServiceTwoTone"))
