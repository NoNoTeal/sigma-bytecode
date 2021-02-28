public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u7873\u99f7\u3c25\uff55\u446c\ubefe {
    public void \u7873\u99f7\u3c25\uff55\u446c\ubefe() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u7873\u99f7\u3c25\uff55\u446c\ubefe, ldc:Class<\u3711\u7873\u12b2\u3e2a\u3711\u927d>(\u3504\ufe34\u600f\u6b0d\u69d9.\u3711\u7873\u12b2\u3e2a\u3711\u927d.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\u3711\u7873\u12b2\u3e2a\u3711\u927d \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_4_67 : long
        var_6_71 : short
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_67 = invokevirtual:long(\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\u3bc9\ua3b4\u6cfe\u7043\u61a4\u9033, getstatic:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ubefe\u5f50\u494c\u99f7\ub19c\ua61f), p0:ByteBuf)
            var_6_71 = i2s:short(l2i:int(and:long(var_4_67:long, ldc:long(4095L))))
            return:\u3711\u7873\u12b2\u3e2a\u3711\u927d(initobject:\u183a\u6b0d\u3711\uc2e8\u40a9\u5245(\u183a\u6b0d\u3711\uc2e8\u40a9\u5245::<init>, and:int(ushr:int(var_6_71:short[expected:int], ldc:int(8)), ldc:int(15)), and:short(var_6_71:short, ldc:short(15)), and:int(ushr:int(var_6_71:short[expected:int], xor:int(ldc:int(2064), ldc:int(2068))), ldc:int(15)), l2i:int(ushr:long(var_4_67:long, ldc:int(12)))))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, \u3504\ufe34\u600f\u6b0d\u69d9.\u3711\u7873\u12b2\u3e2a\u3711\u927d p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u983f\ucb79\u8df4\u51b2\u6198\ufcaf::\u7049\ubff1\ub7dc\u183a\u4c2b\u3e75, getstatic:\u983f\ucb79\u8df4\u51b2\u6198\ufcaf(\u1833\ud171\u8350\ubded\u34df\uc9f6::\ubefe\u5f50\u494c\u99f7\ub19c\ua61f), p0:ByteBuf, or:long(shl:long(i2l:long(invokeinterface:int(\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u5140\u64ab\u67e9\u8350\u9255\u1833, p1:\u3711\u7873\u12b2\u3e2a\u3711\u927d)), ldc:int(12)), i2l:long(i2s:short[expected:int](or:int(or:int(shl:int(invokeinterface:byte[expected:int](\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u5140\ud36e\u836c\ub113\u6ec6\u12cb, p1:\u3711\u7873\u12b2\u3e2a\u3711\u927d), ldc:int(8)), shl:int(invokeinterface:byte[expected:int](\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u51fa\u64f2\uc29a\u718f\u74b1\u64ab, p1:\u3711\u7873\u12b2\u3e2a\u3711\u927d), xor:int(ldc:int(17034), ldc:int(17038)))), invokeinterface:byte[expected:int](\u3711\u7873\u12b2\u3e2a\u3711\u927d::\u5bc4\u718f\u4e72\uf9c5\u4bc8\u1187, p1:\u3711\u7873\u12b2\u3e2a\u3711\u927d))))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Object(invokevirtual:\u3711\u7873\u12b2\u3e2a\u3711\u927d[expected:Object](\u7873\u99f7\u3c25\uff55\u446c\ubefe::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u7873\u99f7\u3c25\uff55\u446c\ubefe, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(\u7873\u99f7\u3c25\uff55\u446c\ubefe::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u7873\u99f7\u3c25\uff55\u446c\ubefe, p0:ByteBuf, checkcast:\u3711\u7873\u12b2\u3e2a\u3711\u927d(\u3504\ufe34\u600f\u6b0d\u69d9.\u3711\u7873\u12b2\u3e2a\u3711\u927d.class, p1:Object[expected:\u3711\u7873\u12b2\u3e2a\u3711\u927d]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_608 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_5FD = and:int(ldc:int(-422430354), ldc:int(1872199019))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7873\u99f7\u3c25\uff55\u446c\ubefe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1237696013))
        }
        else {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-52429969))
            var_5_85 = and:int(ldc:int(-21044), ldc:int(16947))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26902), ldc:int(-31511)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5FD:int, ldc:int(1738243818))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(4642), ldc:int(4643)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(6147), ldc:int(16385)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_DA:int, ldc:int(-172511494))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1227), ldc:int(4609)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1085555086))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-952973384))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1864201593))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1607630123))
                    }
                    else {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-140611845))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-486121526))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-783817240))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(122408156))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1195816782))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-478262286))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-470287638))
                        var_11_EB = and:int(ldc:int(10936), ldc:int(-10937))
                        goto(Label_1423)
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1656339623))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(548829797))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-166943668))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-405757926))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1995947882))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-702806575))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(672357590))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1879918748))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-472745745))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1705037623))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-369974600))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(10520664))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2138197294))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-924523254))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1826302852))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1671425406))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(8259), ldc:int(2705))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-31167887))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1785513165))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(879380755))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1972445598))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(18519030))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(975906648))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-223138065))
                        var_11_EB = and:int(ldc:int(31616), ldc:int(-31649))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1552882652))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-28236026))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1720400754))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(495835276))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1835375796))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-369182614))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1296865106))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1617327617))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-218666886))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1423)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(193596302))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(796695699))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1864431448))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1672907644))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1676501591))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-100684946))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1064268367))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1844565516))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1269898127))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-309073025))
                        var_17_608 = add:int(var_16_119:int, and:int(ldc:int(1549), ldc:int(28851)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-887600906))
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(-373916561))
                
                if (cmple:boolean(var_5_85 = var_17_608:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32160), ldc:int(-32159))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(904986854))
            goto(Label_0106)
        }
    }
}
