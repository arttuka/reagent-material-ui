(ns reagent-material-ui.icons.health-and-safety-two-tone
  "Imports @material-ui/icons/HealthAndSafetyTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def health-and-safety-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 4.14L6 6.39v4.7c0 4 2.55 7.7 6 8.83 3.45-1.13 6-4.82 6-8.83v-4.7l-6-2.25zM16 13h-2.5v2.5h-3V13H8v-3h2.5V7.5h3V10H16v3z", "opacity" ".3"}) (e "path" #js {"d" "M10.5 13H8v-3h2.5V7.5h3V10H16v3h-2.5v2.5h-3V13zM12 2L4 5v6.09c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91V5l-8-3zm6 9.09c0 4-2.55 7.7-6 8.83-3.45-1.13-6-4.82-6-8.83v-4.7l6-2.25 6 2.25v4.7z"}))
                                                 "HealthAndSafetyTwoTone"))
