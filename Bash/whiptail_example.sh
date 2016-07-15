#!/usr/bin/env bash

NetDev=$( ip -o link show | awk '{print $2,$9}' | grep ": UP" | cut -d ":" -f 1 )
Height=$(tput lines)
Width=$(tput cols)
Height=$((Height / 2))
Width=$(((Width * 2) / 3))

whiptail --yesno --title "Hello!" "Dit is whiptail" $Height $Width


