(ns reagent-material-ui.icons.health-and-safety-rounded
  "Imports @material-ui/icons/HealthAndSafetyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def health-and-safety-rounded (create-svg-icon (e "path" #js {"d" "M10.5 13h-1c-.83 0-1.5-.67-1.5-1.5S8.67 10 9.5 10h1V9c0-.83.67-1.5 1.5-1.5s1.5.67 1.5 1.5v1h1c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5h-1v1c0 .83-.67 1.5-1.5 1.5s-1.5-.67-1.5-1.5v-1zm.8-10.74l-6 2.25C4.52 4.81 4 5.55 4 6.39v4.7c0 5.05 3.41 9.76 8 10.91 4.59-1.15 8-5.86 8-10.91v-4.7c0-.83-.52-1.58-1.3-1.87l-6-2.25c-.45-.18-.95-.18-1.4-.01z"})
                                                "HealthAndSafetyRounded"))
