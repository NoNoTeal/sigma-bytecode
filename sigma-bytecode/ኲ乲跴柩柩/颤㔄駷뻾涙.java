public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\u3504\u99f7\ubefe\u6d99 {
    public void \u98a4\u3504\u99f7\ubefe\u6d99() {
        stack_D3_1 : \ucef1\u3504\u64f2\u6cfe\u52d3 [generated]
        stack_D3_2 : String [generated]
        stack_D3_3 : String [generated]
        expr_80 : \ud158\u839e\u7006\uc3e3\u446c[] [generated]
        
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
            stack_D3_1 = getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\uc229\u760c\u873d\ub6ab\u7043)
            stack_D3_2 = loadelement:String(getstatic:String[](\u98a4\u3504\u99f7\ubefe\u6d99::\u385b\ubefe\ucb79\uc87f\u8df4), and:int(ldc:int(-13533), ldc:int(13388)))
            stack_D3_3 = loadelement:String(getstatic:String[](\u98a4\u3504\u99f7\ubefe\u6d99::\u385b\ubefe\ucb79\uc87f\u8df4), xor:int(ldc:int(4104), ldc:int(4105)))
            expr_80 = newarray:\ud158\u839e\u7006\uc3e3\u446c[](\u3504\ufe34\u600f\u6b0d\u69d9.\ud158\u839e\u7006\uc3e3\u446c.class, and:int(ldc:int(565), ldc:int(16389)))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], and:int(ldc:int(-8585), ldc:int(8584)), initobject:\ufcaf\u99f7\uafe7\ub70c\ua068[expected:\ud158\u839e\u7006\uc3e3\u446c](\ufcaf\u99f7\uafe7\ub70c\ua068::<init>))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], and:int(ldc:int(4613), ldc:int(17417)), initobject:\ub171\uc84e\u7006\uc3e3\uae5d[expected:\ud158\u839e\u7006\uc3e3\u446c](\ub171\uc84e\u7006\uc3e3\uae5d::<init>))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], xor:int(ldc:int(-32512), ldc:int(-32510)), initobject:\u600f\u8cae\u9255\u9033\u983f[expected:\ud158\u839e\u7006\uc3e3\u446c](\u600f\u8cae\u9255\u9033\u983f::<init>))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], and:int(ldc:int(8339), ldc:int(6663)), initobject:\u7d52\u4975\u760c\u385b\u873d[expected:\ud158\u839e\u7006\uc3e3\u446c](\u7d52\u4975\u760c\u385b\u873d::<init>))
            storeelement:\ud158\u839e\u7006\uc3e3\u446c(expr_80:\ud158\u839e\u7006\uc3e3\u446c[], xor:int(ldc:int(17672), ldc:int(17676)), initobject:\uf9c5\u2dcc\u7e3f\u071d\ub83f[expected:\ud158\u839e\u7006\uc3e3\u446c](\uf9c5\u2dcc\u7e3f\u071d\ub83f::<init>))
            invokespecial:\u3bc9\u36d3\u4ab3\u8258\u6c52(\u3bc9\u36d3\u4ab3\u8258\u6c52::<init>, this:\u98a4\u3504\u99f7\ubefe\u6d99, stack_D3_1:\ucef1\u3504\u64f2\u6cfe\u52d3, stack_D3_2:String, stack_D3_3:String, expr_80:\ud158\u839e\u7006\uc3e3\u446c[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_20F : int
        expr_6B : int [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_121_0 : byte[] [generated]
        stack_123_0 : byte[] [generated]
        stack_15B_0 : byte[] [generated]
        stack_15D_0 : byte[] [generated]
        stack_194_0 : byte[] [generated]
        stack_221_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        stack_2DC_0 : byte[] [generated]
        stack_327_0 : byte[] [generated]
        stack_3A7_0 : byte[] [generated]
        var_4_1F5 : int
        var_3_1FA : byte[]
        var_5_1FB : int
        expr_221 : byte [generated]
        var_0_33F : int
        expr_327 : byte [generated]
        stack_373_2 : byte [generated]
        stack_34A_0 : byte [generated]
        var_2_AB : byte[]
        expr_AF : int [generated]
        var_3_260 : byte[]
        var_5_261 : int
        expr_E9 : int [generated]
        expr_123 : int [generated]
        expr_15D : int [generated]
        var_3_396 : byte[]
        var_5_397 : int
        var_3_1A0 : String
        stack_1EE_0 : String[] [generated]
        expr_1B2 : String[] [generated]
        
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
        var_0_20F = and:int(ldc:int(-117882410), ldc:int(2061459911))
        expr_6B = arraylength:int(stack_AB_0 = stack_AD_0 = stack_E7_0 = stack_E9_0 = stack_121_0 = stack_123_0 = stack_15B_0 = stack_15D_0 = stack_194_0 = stack_221_0 = stack_271_0 = stack_2DC_0 = stack_327_0 = stack_3A7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("tlBwmL+/WPC2UHByD5+/AHDgcL+flb846N//8hI6mqII")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1F5 = expr_6B:int
        var_3_1FA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1FB = expr_6B:int
        Label_0509:
        
        while (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_20F = and:int(var_0_20F:int, ldc:int(695381787))
                goto(Label_0696)
            }
            
            var_0_20F = and:int(var_0_20F:int, ldc:int(2107466746))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            expr_221 = loadelement:byte(stack_221_0:byte[], var_5_1FB:int)
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, or:int(and:int(shl:int(expr_221:byte, xor:int(ldc:int(1091), ldc:int(1095))), ldc:int(-16)), and:int(shr:int(expr_221:byte[expected:int], and:int(ldc:int(8452), ldc:int(6199))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E7_0 = stack_E9_0 = stack_121_0 = stack_123_0 = stack_15B_0 = stack_15D_0 = stack_194_0 = stack_221_0 = stack_271_0 = stack_2DC_0 = stack_327_0 = stack_3A7_0 = var_3_1FA:byte[]
            goto(Label_0112)
        }
        
        goto(Label_0779)
        Label_0696:
        
        while (cmpne:boolean(and:int(var_0_20F:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20F:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_20F = and:int(var_0_20F:int, ldc:int(-483129484))
                goto(Label_0509)
            }
            
            var_0_20F = and:int(var_0_20F:int, ldc:int(2023644151))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, xor:byte(loadelement:byte(stack_2DC_0:byte[], var_5_1FB:int), ldc:byte(14)))
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E7_0 = stack_E9_0 = stack_121_0 = stack_123_0 = stack_15B_0 = stack_15D_0 = stack_194_0 = stack_221_0 = stack_271_0 = stack_2DC_0 = stack_327_0 = stack_3A7_0 = var_3_1FA:byte[]
            goto(Label_0238)
        }
        
        Label_0779:
        
        while (cmpne:boolean(and:int(var_0_20F:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0509)
            }
            
            var_0_33F = and:int(var_0_20F:int, ldc:int(-73704478))
            var_5_1FB = add:int(var_5_1FB:int, ldc:int(-1))
            expr_327 = stack_373_2 = loadelement(stack_327_0, var_5_1FB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1FB:int, ldc:int(5)), neg:int(var_4_1F5:int)), ldc:int(0))) {
                stack_373_2 = stack_34A_0 = add:byte(expr_327:byte, loadelement:byte(var_3_1FA:byte[], add:int(var_5_1FB:int, ldc:int(5))))
                goto(Label_0858)
            }
            
            Label_0820:
            
            if (cmpne:boolean(and:int(var_0_33F:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_33F = and:int(var_0_33F:int, ldc:int(-539335387))
            }
            else {
                var_0_33F = and:int(var_0_33F:int, ldc:int(-554074677))
                stack_373_2 = stack_34A_0 = add:byte(expr_327:byte, ldc:byte(5))
            }
            
            Label_0858:
            
            if (cmpeq:boolean(and:int(var_0_33F:int, ldc:int(524288)), ldc:int(0))) {
                var_0_33F = and:int(var_0_33F:int, ldc:int(-1036614281))
                goto(Label_0820)
            }
            
            var_0_20F = and:int(var_0_33F:int, ldc:int(-52673537))
            storeelement:byte(var_3_1FA:byte[], var_5_1FB:int, stack_373_2:byte)
            
            if (cmpne:boolean(var_5_1FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AD_0 = stack_AB_0 = stack_E7_0 = stack_E9_0 = stack_121_0 = stack_123_0 = stack_15B_0 = stack_15D_0 = stack_194_0 = stack_221_0 = stack_271_0 = stack_2DC_0 = stack_327_0 = stack_3A7_0 = var_3_1FA:byte[]
            goto(Label_0296)
        }
        
        goto(Label_0696)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(-1391719656))
            goto(Label_0354)
        }
        
        if (cmpne:boolean(and:int(var_0_20F:int, ldc:int(131072)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(35813604))
            goto(Label_0296)
        }
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(2)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(-1823231376))
            goto(Label_0238)
        }
        
        if (cmpne:boolean(and:int(var_0_20F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(-86288406))
            var_2_AB = stack_AB_0:byte[]
            expr_AF = add:int(arraylength:int(stack_AD_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AF:int, ldc:int(0))) {
                var_3_260 = newarray:byte[](byte.class, expr_AF:int)
                var_5_261 = expr_AF:int
                
                loop {
                    var_0_20F = and:int(var_0_20F:int, ldc:int(-84225074))
                    var_5_261 = add:int(var_5_261:int, ldc:int(-1))
                    storeelement:byte(var_3_260:byte[], var_5_261:int, add:int(shl:int(loadelement:byte(stack_271_0:byte[], var_5_261:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_AB:byte[], add:int(var_5_261:int, and:int(ldc:int(10433), ldc:int(5145)))), ldc:int(7)), and:int(ldc:int(273), ldc:int(14369)))))
                    
                    if (cmpne:boolean(var_5_261:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_E7_0 = stack_E9_0 = stack_121_0 = stack_123_0 = stack_15B_0 = stack_15D_0 = stack_194_0 = stack_221_0 = stack_271_0 = stack_2DC_0 = stack_327_0 = stack_3A7_0 = var_3_260:byte[]
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0354)
        }
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(16384)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(13851013))
            goto(Label_0296)
        }
        
        if (cmpne:boolean(and:int(var_0_20F:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_20F:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_20F = and:int(var_0_20F:int, ldc:int(667260307))
                goto(Label_0112)
            }
            
            var_0_20F = and:int(var_0_20F:int, ldc:int(-558050342))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_1F5 = expr_E9:int
                var_3_1FA = newarray:byte[](byte.class, expr_E9:int)
                var_5_1FB = expr_E9:int
                goto(Label_0696)
            }
        }
        
        Label_0238:
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(2)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(367298174))
            goto(Label_0354)
        }
        
        if (cmpne:boolean(and:int(var_0_20F:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(524288)), ldc:int(0))) {
                var_0_20F = and:int(var_0_20F:int, ldc:int(-1059477498))
                goto(Label_0112)
            }
            
            var_0_20F = and:int(var_0_20F:int, ldc:int(-23235622))
            expr_123 = arraylength:int(stack_123_0:byte[])
            
            if (cmpne:boolean(expr_123:int, ldc:int(0))) {
                var_4_1F5 = expr_123:int
                var_3_1FA = newarray:byte[](byte.class, expr_123:int)
                var_5_1FB = expr_123:int
                goto(Label_0779)
            }
        }
        
        Label_0296:
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(2)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(-669341089))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(128)), ldc:int(0))) {
                var_0_20F = and:int(var_0_20F:int, ldc:int(-1371078717))
                goto(Label_0180)
            }
            
            if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_20F = and:int(var_0_20F:int, ldc:int(2090590663))
            expr_15D = arraylength:int(stack_15D_0:byte[])
            
            if (cmpne:boolean(expr_15D:int, ldc:int(0))) {
                var_3_396 = newarray:byte[](byte.class, expr_15D:int)
                var_5_397 = expr_15D:int
                
                loop {
                    var_0_20F = and:int(var_0_20F:int, ldc:int(-589632045))
                    var_5_397 = add:int(var_5_397:int, ldc:int(-1))
                    storeelement:byte(var_3_396:byte[], var_5_397:int, add:byte(loadelement:byte(stack_3A7_0:byte[], var_5_397:int), ldc:byte(19)))
                    
                    if (cmpne:boolean(var_5_397:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AD_0 = stack_AB_0 = stack_E7_0 = stack_E9_0 = stack_121_0 = stack_123_0 = stack_15B_0 = stack_15D_0 = stack_194_0 = stack_221_0 = stack_271_0 = stack_2DC_0 = stack_327_0 = stack_3A7_0 = var_3_396:byte[]
            }
        }
        
        Label_0354:
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(-1375977675))
            goto(Label_0296)
        }
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0180)
        }
        
        if (cmpeq:boolean(and:int(var_0_20F:int, ldc:int(256)), ldc:int(0))) {
            var_0_20F = and:int(var_0_20F:int, ldc:int(-769411007))
            goto(Label_0112)
        }
        
        var_3_1A0 = initobject:String(String::<init>, stack_194_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1EE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(0), ldc:int(2)))
        expr_1B2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(70), ldc:int(29451)))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(-2461), ldc:int(2444)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, and:int(ldc:int(-19508), ldc:int(19489)), and:int(ldc:int(8216), ldc:int(22600))))
        storeelement:String(expr_1B2:String[], and:int(ldc:int(67), ldc:int(19073)), invokevirtual:String[expected:String](String::substring, var_3_1A0:String, xor:int(ldc:int(-32174), ldc:int(-32166)), xor:int(ldc:int(12381), ldc:int(12413))))
        putstatic:String[](\u98a4\u3504\u99f7\ubefe\u6d99::\u385b\ubefe\ucb79\uc87f\u8df4, expr_1B2:String[])
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(-1699482045), ldc:int(2059403252))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u98a4\u3504\u99f7\ubefe\u6d99[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(2080637392))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-606863676))
            var_5_85 = and:int(ldc:int(-25234), ldc:int(25233))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30556), ldc:int(30043)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61D:int, ldc:int(-552354869))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(8297), ldc:int(16529)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(17568), ldc:int(17569)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_DA:int, ldc:int(-628031528))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8327), ldc:int(22273)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1969267185))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1174911820))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1525348999))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1584630329))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(712833021))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(505443886))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-580068900))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1976585578))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-34298809))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(663136473))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-826690829))
                        var_11_EB = and:int(ldc:int(1303), ldc:int(-1304))
                        goto(Label_1441)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1358193347))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-738206911))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1691000871))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1536408522))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2105091601))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2061318250))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2083186373))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-571810483))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1190014896))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-554648623))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2032388878))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1225187709))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(348465374))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-283150613))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1322843118))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(3333), ldc:int(1))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2059266255))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1104151198))
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-135465910))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(128021940))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(204751531))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2127870704))
                        var_11_EB = and:int(ldc:int(24609), ldc:int(-24610))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1175173579))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-973286524))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1362937661))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1257149174))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1686978969))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1303)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2033624224))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1692361119))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1722633574))
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1127087659))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1055745233))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(2077686474))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1441)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1303:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1108496672))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1732021377))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1610600607))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1249414489))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1861997288))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(-1435175060))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1441:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1452:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1035509481))
                        goto(Label_1303)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1081368925))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(89855965))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-719996987))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1656833565))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1640320048))
                        var_17_628 = add:int(var_16_119:int, and:int(ldc:int(7305), ldc:int(519)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(509261380))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, xor:int(ldc:int(2596), ldc:int(2597))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(524288)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-1497403757))
            goto(Label_0106)
        }
    }
}
