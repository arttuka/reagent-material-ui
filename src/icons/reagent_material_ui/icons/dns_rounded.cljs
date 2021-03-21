(ns reagent-material-ui.icons.dns-rounded
  "Imports @material-ui/icons/DnsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dns-rounded (create-svg-icon (e "path" #js {"d" "M20 13H4c-.55 0-1 .45-1 1v7c0 .55.45 1 1 1h16c.55 0 1-.45 1-1v-7c0-.55-.45-1-1-1zM7.5 19c-.83 0-1.5-.67-1.5-1.5S6.67 16 7.5 16s1.5.67 1.5 1.5S8.33 19 7.5 19zM20 3H4c-.55 0-1 .45-1 1v7c0 .55.45 1 1 1h16c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1zM7.5 9C6.67 9 6 8.33 6 7.5S6.67 6 7.5 6 9 6.67 9 7.5 8.33 9 7.5 9z"})
                                  "DnsRounded"))
