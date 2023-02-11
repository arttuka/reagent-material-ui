(ns reagent-mui.icons.contact-emergency-rounded
  "Imports @mui/icons-material/ContactEmergencyRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def contact-emergency-rounded (create-svg-icon (e "path" #js {"d" "M22 3H2C.9 3 0 3.9 0 5v14c0 1.1.9 2 2 2h20c1.1 0 1.99-.9 1.99-2L24 5c0-1.1-.9-2-2-2zM9 8c1.65 0 3 1.35 3 3s-1.35 3-3 3-3-1.35-3-3 1.35-3 3-3zM2.08 19c1.38-2.39 3.96-4 6.92-4s5.54 1.61 6.92 4H2.08zm18.52-8.5c-.21.36-.67.48-1.02.27l-.82-.48v.95c0 .41-.34.75-.75.75s-.75-.34-.75-.75v-.94l-.82.48c-.36.21-.82.08-1.02-.27-.21-.36-.08-.82.27-1.02L16.5 9l-.82-.48c-.36-.21-.48-.67-.27-1.02.21-.36.67-.48 1.02-.27l.82.48v-.96c0-.41.34-.75.75-.75s.75.34.75.75v.95l.82-.48c.36-.21.82-.08 1.02.27.21.36.08.82-.27 1.02L19.5 9l.82.48c.36.2.49.66.28 1.02z"})
                                                "ContactEmergencyRounded"))
