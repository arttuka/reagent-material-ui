(ns reagent-material-ui.icons.perm-contact-calendar-rounded
  "Imports @material-ui/icons/PermContactCalendarRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def perm-contact-calendar-rounded (create-svg-icon (e "path" #js {"d" "M19 4h-1V3c0-.55-.45-1-1-1s-1 .45-1 1v1H8V3c0-.55-.45-1-1-1s-1 .45-1 1v1H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm-7 3c1.93 0 3.5 1.57 3.5 3.5S13.93 14 12 14s-3.5-1.57-3.5-3.5S10.07 7 12 7zm7 13H5v-.23c0-.62.28-1.2.76-1.58C7.47 16.82 9.64 16 12 16s4.53.82 6.24 2.19c.48.38.76.97.76 1.58V20z"})
                                                    "PermContactCalendarRounded"))
