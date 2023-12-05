def edge_coloring(edges_list):
    e = len(edges_list)
    colors = []
    for i in range(e):
        colors.append(0)
    i = 0
    color = 1
    while i < e:
        colors[i] = color
        flag = False
        for j in range(e-1):
            if j != i:
                common_vertices = intersect(edges_list[i], edges_list[j])
                if common_vertices.not_empty() and colors[i] = colors[j]:
                    color = color + 1
                    flag = True
                    break
        if not flag:
            color = 1
            i = i + 1
    return colors