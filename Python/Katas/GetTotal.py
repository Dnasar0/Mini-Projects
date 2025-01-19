def get_total(costs, items, tax):
        total = 0
        for item in items:
            if item not in costs:
                pass
            else:
                current_item = costs[item]
                total = total + current_item
        return round(total + (total * tax),2)

costs = {'socks':5, 'shoes':60, 'sweater':30}
total = get_total(costs, ['socks', 'shoes'], 0.09)
print(total)