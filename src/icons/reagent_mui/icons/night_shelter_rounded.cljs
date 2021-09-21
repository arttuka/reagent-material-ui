(ns reagent-mui.icons.night-shelter-rounded
  "Imports @mui/icons-material/NightShelterRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def night-shelter-rounded (create-svg-icon (e "path" #js {"d" "m10.8 3.9-6 4.5c-.5.38-.8.97-.8 1.6v9c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-9c0-.63-.3-1.22-.8-1.6l-6-4.5c-.71-.53-1.69-.53-2.4 0zm-1.05 8.6c.69 0 1.25.56 1.25 1.25S10.44 15 9.75 15s-1.25-.56-1.25-1.25.56-1.25 1.25-1.25zM16.5 18c-.28 0-.5-.22-.5-.5v-1H8v1c0 .28-.22.5-.5.5s-.5-.22-.5-.5v-6c0-.28.22-.5.5-.5s.5.22.5.5v4h3.5v-3c0-.28.22-.5.5-.5h3c1.1 0 2 .9 2 2v3.5c0 .28-.22.5-.5.5z"})
                                            "NightShelterRounded"))
