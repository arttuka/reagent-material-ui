(ns reagent-material-ui.icons.car-rental
  "Imports @material-ui/icons/CarRental as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def car-rental (create-svg-icon (e "path" #js {"d" "M16.39 9H7.61c-.43 0-.81.28-.95.68l-1.66 5v6.81c0 .29.23.51.5.51h1c.28 0 .5-.22.5-.5V20h10v1.5c0 .28.22.5.5.5h1c.28 0 .5-.22.5-.5v-6.81l-1.66-5c-.14-.41-.52-.69-.95-.69zm-8.61 9c-.68 0-1.22-.54-1.22-1.22s.54-1.22 1.22-1.22S9 16.11 9 16.78 8.46 18 7.78 18zm8.44 0c-.67 0-1.22-.54-1.22-1.22s.54-1.22 1.22-1.22 1.22.54 1.22 1.22S16.9 18 16.22 18zm-9.93-4l1.33-4h8.78l1.33 4H6.29zm4.54-11C10.41 1.83 9.3 1 8 1 6.34 1 5 2.34 5 4c0 1.65 1.34 3 3 3 1.3 0 2.41-.84 2.83-2H16v2h2V5h1V3h-8.17zM8 5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                 "CarRental"))
