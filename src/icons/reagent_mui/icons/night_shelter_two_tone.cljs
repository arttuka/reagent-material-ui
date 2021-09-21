(ns reagent-mui.icons.night-shelter-two-tone
  "Imports @mui/icons-material/NightShelterTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def night-shelter-two-tone (create-svg-icon [(e "path" #js {"d" "m12 5.5 6 4.5v9H6v-9l6-4.5m3 6.5h-3.5v3.5H8V11H7v7h1v-1.5h8V18h1v-4c0-1.1-.9-2-2-2zm-5.25.5c-.69 0-1.25.56-1.25 1.25S9.06 15 9.75 15 11 14.44 11 13.75s-.56-1.25-1.25-1.25z", "opacity" ".3"}) (e "path" #js {"d" "m12 5.5 6 4.5v9H6v-9l6-4.5M12 3 4 9v12h16V9l-8-6zm3 9h-3.5v3.5H8V11H7v7h1v-1.5h8V18h1v-4c0-1.1-.9-2-2-2zm-5.25.5c-.69 0-1.25.56-1.25 1.25S9.06 15 9.75 15 11 14.44 11 13.75s-.56-1.25-1.25-1.25z"})]
                                             "NightShelterTwoTone"))
